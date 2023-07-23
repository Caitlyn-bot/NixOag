<template>
  <div>
    user
  </div>
</template>

<script>
export default {
  name: "UserList",
  data() {
    return {
      tableData: [{
        date: '2016-05-02',
        name: '王小虎',
        bir:'2016-05-02',
        address: '上海市普陀区金沙江路 1518 弄',
        sex:'男'
      }, {
        date: '2016-05-02',
        name: '王小虎',
        bir:'2016-05-02',
        address: '上海市普陀区金沙江路 1518 弄',
        sex:'男'
      }, {
        date: '2016-05-02',
        name: '王小虎',
        bir:'2016-05-02',
        address: '上海市普陀区金沙江路 1518 弄',
        sex:'男'
      }, {
        date: '2016-05-02',
        name: '刘二',
        bir:'2016-05-02',
        address: '上海市普陀区金沙江路 1518 弄',
        sex:'男'
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
