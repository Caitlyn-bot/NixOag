<template>
  <div class="header">
    <el-header>
      <!--头部菜单-->
      <el-menu  class="el-menu-demo" mode="horizontal"
               background-color="#545c64"
               text-color="#fff"
               active-text-color="#ffd04b">
        <el-menu-item index="/"><i class="el-icon-s-home"></i>主页</el-menu-item>
        <el-menu-item ><i class="el-icon-location"></i></el-menu-item>
        <el-menu-item index="/users">用户管理</el-menu-item>
        <el-menu-item index="3">消息中心</el-menu-item>
        <el-menu-item index="4">订单管理</el-menu-item>
      </el-menu>
    </el-header>
  </div>
</template>

<script>
export default {
  name: "Header"
}
</script>

<style scoped>
  .el-header {
    padding: 0px;
  }
</style>
