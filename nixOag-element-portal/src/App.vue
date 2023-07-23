<template>
  <div id="app">
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: 'App',
  data() {
    return {
      activeIndex: '1',
      //控制侧面菜单的缩放
      isCollapse: true
    };
  },
  methods: {
    handleSelect(key, keyPath) {
      console.log(key, keyPath);
      this.$router.push(key);
    },
    handleSideMenu() {
      this.isCollapse = !this.isCollapse;
    },
  }
}
</script>

<style>
</style>
