<template>
  <div id="nixOagMenu" class="menu">
    <el-aside width="200px">
      <el-menu
        router
        background-color="#545c64"
        text-color="#fff"
        active-text-color="#ffd04b"
        >
        <template v-for="(item, index) in menus">
          <el-submenu :index="index + ''" :key="index" v-if="!item.hidden">
            <template slot="title">
              <i :class="item.iconClass"></i>
              <span>{{ item.name }}</span>
            </template>
            <el-menu-item-group v-for="(child, index) in item.children" :key="index">
              <el-menu-item :index="child.path">
                <i :class="child.iconClass"></i>
                {{ child.name }}
              </el-menu-item>
            </el-menu-item-group>
          </el-submenu>
        </template>
      </el-menu>
    </el-aside>
  </div>
</template>

<script>
export default {
  name: "Menu",
  data() {
    return {
      menus: []
    };
  },
  created() {
    console.log(this.$router.options.routes)
    this.menus = [...this.$router.options.routes];
  },
  handleOpen(key, keyPath) {
    console.log(key, keyPath);
  },
  handleClose(key, keyPath) {
    console.log(key, keyPath);
  }
}
</script>

<style>
  .menu {

  }
  .menu .el-aside {
    height: 100%;
  }
  .menu .el-aside .el-menu {
    height: 100%;
    min-width: 0;
    border: 0px;
  }
  .menu .el-aside .el-submenu .el-menu-item {
    min-width: 0;
  }
</style>
