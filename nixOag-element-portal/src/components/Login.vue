<template>
  <div class="login">
    <el-card class="box-card">
      <div slot="header" class="clearfix">
        <span>NixOag</span>
      </div>
      <el-form
        label-width="80px"
        :model="form"
        ref="form">
        <el-form-item label="用户名" prop="userName" :rules="[
          {required: true, message: '请输入用户名', trigger: 'blur'},
          {min: 4, max: 10, message: '长度在4-10位字符之间', trigger: 'blur'}
        ]">
          <el-input v-model="form.userName"></el-input>
        </el-form-item>
        <el-form-item label="密码" prop="password" :rules="[
          {required: true, message: '请输入密码', trigger: 'blur'},
          {min: 6, max: 12, message: '长度在6-12位字符之间', trigger: 'blur'}
        ]">
          <el-input type="password" v-model="form.password"></el-input>
        </el-form-item>
        <el-form-item label="验证码" prop="verifyCode">
          <el-input v-model="form.verifyCode"></el-input>
          <el-image :src="verifySrc" @click="getCode">
            <div slot="placeholder" class="image-slot">
              加载中<span class="dot">...</span>
            </div>
          </el-image>
        </el-form-item>
        <el-form-item label="">
          <el-button type="primary" @click="login('form')">Login</el-button>
        </el-form-item>
      </el-form>
    </el-card>

  </div>
</template>

<script>
import {setToken} from '@/utils/setToken.js'
import request from '@/utils/service'
export default {
  name: "Login",
  data() {
    return{
      form: {
        userName: 'zzw123',
        password: 'zzw123',
        verifyCode: ''
      },
      verifySrc: 'http://localhost:8081/nixOag/login/generator'
    }
  },
  methods: {
    getCode() { //点击的时候就图片就请求 图片就换了
      let randomNum = parseInt(i, 10);
      this.random = randomNum;
      this.verifySrc = 'http://localhost:8081/nixOag/login/generator' + randomNum;
    },
    login(form) {
      this.$refs[form].validate((validate) => {
        if (validate) {
          console.log(this.form);
          request({
            url: '/login/verify',
            method: 'get',
            params: {verifyCode: this.form.verifyCode}
          }).then(response => {
            console.log(response.data);
            if (response.data) {
              this.loginVerify();
            }
            else {
              this.$message({
                message: '验证码错误',
                type: 'warning'
              });
            }
          })
            .catch(err => {
              console.log(err);
            });

        }
        else {
          console.error(this.form)
        }
      })
    },
    loginVerify() {
      request({
        url: '/login/userLogin',
        method: 'post',
        data: this.form
      }).then( response => {
        console.log(response.data.flag);
        if (response.data.flag) {
          setToken('username', response.data.userName);
          this.$message({message: response.data.message, type: 'success'});
          this.$router.push('/home');
        }
      })
        .catch(err => {
          console.log(err);
        });
    }
  }
}
</script>

<style scoped>
  .login {
    width: 100%;
    height: 100%;
    position: absolute;
    background: #409EFF;
  }
  .box-card {
    width: 450px;
    margin: 200px auto;
  }
  .clearfix {
    font-size: 34px;
  }
  .el-button {
    width: 100%;
  }
</style>
