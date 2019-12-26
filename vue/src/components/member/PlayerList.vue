<template>
	<div>선수 목록
		<table class="table">
			<tr>
			<th>No.</th><th>아이디</th><th>비번</th><th>이름</th><th>생년월일</th>
			<th>성별</th><th>데뷔년</th><th>그룹번호</th><th>스탯</th>
			</tr>
		<tr v-for="(j, i) of list" :key="j.id">
		<td>{{i+1}}</td><td>{{j.userid}}</td><td>{{j.passwd}}</td><td>{{j.name}}</td><td>{{j.birthday}}</td><td>{{j.gender}}</td><td>{{j.hak}}</td><td>{{j.ban}}</td><td>{{j.score}}</td>
		</tr>
		</table>
	</div>
</template>
<script>
import axios from 'axios'
export default {
	data() {
		return {
			context: 'http://localhost:8080/',
			list: []
		}
	},
	created(){
		axios.get(`${this.context}/players`).then(res=>{
			this.list = res.data
		})
		.catch(e=>{
			alert('axios fail'+e)
		})
	}
}
</script>
<style scoped>
.talbe{border : 1px solid black}
.table tr{border : 1px solid black}
.talbe tr th{border : 1px solid black}
.table tr td{border : 1px solid black}
</style>