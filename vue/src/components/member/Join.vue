<template>
<div class="container">
<div class="row centered-form">
<div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
<div class="panel panel-default">
<div class="panel-heading">
<h3 class="panel-title">Please sign up for Bootsnipp <small>It's free!</small></h3>
</div>
<div class="panel-body">
<form role="form">
<div class="row">
<div class="col-xs-6 col-sm-6 col-md-6">
      <div class="form-group">
        <input v-model="name" type="text" name="name" id="name" class="form-control input-sm" placeholder="Name">
      </div>
    </div>
    <div class="col-xs-6 col-sm-6 col-md-6">
      <div class="form-group">
        <input v-model="birthday" type="text" name="birthday" id="birthday" class="form-control input-sm" placeholder="Birthday">
      </div>
    </div>
  </div>

  <div class="form-group">
    <input v-model="userid" type="text" name="userid" id="userid" class="form-control input-sm" placeholder="Userid">
  </div>

  <div class="row">
    <div class="col-xs-6 col-sm-6 col-md-6">
      <div class="form-group">
        <input v-model="passwd" type="password" name="passwd" id="passwd" class="form-control input-sm" placeholder="Password">
      </div>
    </div>
   <!--  <div class="col-xs-6 col-sm-6 col-md-6">
      <div class="form-group">
        <input v-model="passwd" type="password" name="password_confirmation" id="password_confirmation" class="form-control input-sm" placeholder="Confirm Password">
      </div>
    </div> -->
  </div>
  <button @click.prevent="join" type="submit" value="Register" class="btn btn-info btn-block">join</button>
</form>
</div>
</div>
</div>
</div>
</div>
</template>
<script>
import axios from "axios"
export default {
	data () {
		return {
			context: 'http://localhost:8080/',
			result: '',
			userid:'',
      passwd:'',
      name:'',
      birthday:''
    }
  },
	methods : {
    join(){
      alert(this.userid)
      let url = `${this.context}/join`
      let data = {
        userid: this.userid,
        passwd: this.passwd,
        name: this.name,
        birthday: this.birthday
      }
      let headers = {
				'authorization': 'JWT fefege..',
				'Accept' : 'application/json',
				'Content-Type': 'application/json'
      }
     axios.post(url, data, headers).then(()=>{
				alert(`axios 회원가입성공 ${this.userid}`)
				this.$router.push({path : '/login'})
			}).catch(()=>{
				alert('axios 실패')
			})
		}
	}
}
</script>
<style scoped>
.centered-form{
	margin-top: 60px;
}

.centered-form .panel{
	background: rgba(255, 255, 255, 0.8);
	box-shadow: rgba(0, 0, 0, 0.3) 20px 20px 20px;
}
</style>
