import Vue from 'vue';
import Router from 'vue-router';
import Home from '@/components/Home';
import Login from '@/components/Login';
import User from '@/components/user/User';
import Role from '@/components/user/Role';

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect: '/login',
      component: Login,
      hidden:true
    },
    {
      path: '/login',
      name: 'Login',
      component: Login,
      iconClass: 'el-icon-s-home',
      hidden:true
    },
    {
      path: '/home',
      name: '权限管理',
      // redirect: '/home/user',
      component: Home,
      iconClass: 'el-icon-user',
      children: [
        {
          path:'/home/user',
          name:'用户管理',
          iconClass: 'fa fa-list',
          component: User
        },
        {
          path:'/home/roles',
          name:'角色管理',
          iconClass: 'fa fa-list',
          component: Role
        }
      ]
    }

  ]
})
