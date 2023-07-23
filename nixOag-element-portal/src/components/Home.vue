<template>
  <div class="home">
    <Header/>
    <el-container class="content">
      <!--侧栏菜单-->
      <Menu/>
      <el-container>
        <el-main>
          <BreadCrumb/>
          <div class="cont">
            <router-view></router-view>
          </div>
        </el-main>
        <el-footer>
          <Footer/>
        </el-footer>
      </el-container>

    </el-container>

  </div>

</template>

<script>
import Header from './common/Header'
import Menu from './common/Menu'
import BreadCrumb from "./common/BreadCrumb";
import Footer from './common/Footer'

export default {
  components: {
    Header,
    Menu,
    BreadCrumb,
    Footer
  },
  name: 'Home',
  data() {
    return {}
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.home {
  width: 100%;
  height: 100%;
  overflow: hidden;
}
.content {
  position: absolute;
  width: calc(100% - 16px);
  top: 60px;
  bottom: 0;
}
.home .content .el-container.is-vertical {
  overflow:hidden;
}
.home .content .cont {
  margin: 20px 0;
}

</style>
