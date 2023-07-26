import axios from "axios";
import {getToken} from '@/utils/setToken';
import {Promise} from 'core-js';
import {Message} from "element-ui";

const service = axios.create({
  baseURL: 'http://localhost:8081/nixOag',
  timeout: 5000
})

//添加请求拦截器
service.interceptors.request.use((config) => {
  config.headers['token'] = getToken('token');
  return config;
}, (error)=> {
  return Promise.reject(error);
});
//添加响应拦截器
service.interceptors.response.use((response) => {
  const res = response.data;
  if (res.code !== 200) {
    // Message({message: res.message || 'error', type: 'warning'})
  }
  return response;
}, (error)=> {
  return Promise.reject(error);
});

export default service
