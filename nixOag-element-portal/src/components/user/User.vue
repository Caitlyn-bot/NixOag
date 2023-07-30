<template>
  <el-table
    :data="tableData"
    style="width: 100%">
    <el-table-column
      prop="username"
      label="用户名"
      width="180">
    </el-table-column>
    <el-table-column
      prop="password"
      label="密码">
    </el-table-column>
    <el-table-column
      prop="createdDate"
      label="创建日期"
      width="180">
    </el-table-column>
    <el-table-column
      prop="updatedDate"
      label="更新日期"
      width="180">
    </el-table-column>
    <el-table-column
      prop="userState"
      label="头像"
      width="180">
    </el-table-column>
    <el-table-column
      prop="headUrl"
      label="头像"
      width="180">
    </el-table-column>
  </el-table>
</template>

<script>
export default {
  name: "UserList",
  data() {
    return {
      tableData: [{
        username: '王小虎',
        password:'1234',
        createdDate: '2016-05-02',
        updatedDate: '2016-05-02',
        userState:'在用',
        headUrl: '上海市普陀区金沙江路 1518 弄'
      }],
      search:''
    }
  },
  methods: {
    handleEdit(index, row) {
      console.log(index, row);
    },
    handleDelete(index, row) {
      console.log(index, row);
    }
  },
  created() {
    this.$http.get("").then(res=>{
      this.tableData = res.data;
    })
  }
}
</script>

<style scoped>

</style>
