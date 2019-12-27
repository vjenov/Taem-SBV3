<template>
	<div class="search-form">
    <form>
        <h2 class="text-center">선수 검색</h2>       
        <div class="form-group">
            <input v-model="searchWord" type="text" class="form-control" placeholder="id코드입력" required="required">
        </div>
        <div class="form-group">
			<button @click.prevent="find" type="submit" class="btn btn-primary btn-block">전송</button>
        </div>
    </form>
	</div>
</template>
<script>
import axios from 'axios'
export default{
	data(){
		return {
			context: 'http://localhost:8080/',
			list: []
		}
	},
	methods : {
		find(){
			axios
			.get(`${this.context}/players`)
			.then(res =>{
				this.list = res.data
			})
			.catch(e=>{
				alert('AXIOS FAIL'+e)
			})
		}
	}
}
</script>
<style scoped type="text/css">
.search-form {
	width: 340px;
	margin: 50px auto;
}
.search-form form {
	margin-bottom: 15px;
	background: #f7f7f7;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	padding: 30px;
}
.search-form h2 {
	margin: 0 0 15px;
}
.form-control, .btn {
	min-height: 38px;
	border-radius: 2px;
}
.btn {        
	font-size: 15px;
	font-weight: bold;
}
</style>