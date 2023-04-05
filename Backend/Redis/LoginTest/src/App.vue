<script setup lang="ts">
import LoginButton from './components/common/LoginButton.vue';
import { ref } from 'vue'
const account = ref<String>()
const password = ref<String>()

const login = async () => {
  const user = {
    account: account.value,
    password: password.value
  }
  const headers = new Headers({
    'Content-Type': "application/json"
  })
  const r = await fetch("/api/user/login", { method: "post", body: JSON.stringify(user), headers })
  const res = await r.json()
  console.log(res)
}

</script>

<template>
  <div class="container">
    <form class="register" action="./2.html" method="post">

      <div class="usernameDiv">
        <label for="username" class="title2">用户名:</label>
        <input v-model="account" type="text" name="account" class="inp" autocomplete="off" placeholder="请输入用户名">
      </div>


      <div class="phoneDiv">
        <label for="phone" class="title2">密码:</label>
        <input v-model="password" type="password" name="password" class="inp" id="phone" autocomplete="off"
          placeholder="请输入密码">
      </div>


      <LoginButton @click="login" :title="'登陆'"></LoginButton>

      <div class="left" id="left">
      </div>
      <div class="right" id="right">
      </div>

    </form>
  </div>
</template>

<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

input:focus {
  outline: none;
}

body {
  position: fixed;
  width: 100%;
  height: 100vh;
  background-color: #fff;
}

.container {
  height: 50%;
}

.container .register {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;

  position: relative;
  height: 100%;
  width: 600px;
  margin: 100px auto;
  background-color: #fff;
  border-radius: 20px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
  transition: all 0.5s;
}

.container .register:hover {
  transform: translateY(-10px);
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.6);
}

.container .register::before {
  content: "register";
  position: absolute;
  top: -54px;
  left: 50px;
  font-size: 50px;
  color: #333;
  text-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
}

.container .title {
  margin-bottom: 20px;
  color: #333;
  font-weight: 700;
  font-size: 30px;
}

.container .title2 {
  margin-bottom: 20px;
  color: #666;
  font-weight: 400;
  font-size: 20px;
}

/* 文本框抖动动画 */
@keyframes shake {
  0% {
    transform: translateX(0);
  }

  25% {
    transform: translateX(5px);
  }

  50% {
    transform: translateX(-5px);
  }

  75% {
    transform: translateX(5px);
  }

  100% {
    transform: translateX(0);
  }
}

.container .inp {
  width: 300px;
  height: 50px;
  border-radius: 25px;
  padding: 15px;
  border: none;
  border: 1px solid #333;
  color: #333;
  font-size: 20px;
  font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
  transition: all 0.5s ease;
  margin-top: 20px;
}

.container .inp:focus {
  width: 320px;
}

.container .inp::placeholder {
  color: #888;
}

.container .username_error {
  /* 使用透明度来做过渡动画 */
  opacity: 0;
  color: rgba(255, 0, 0, .8);
  font-size: 14px;
  transition: all 0.5s ease;
  margin-left: 30px;
}

.container .phone_error {
  opacity: 0;
  color: rgba(255, 0, 0, .8);
  font-size: 14px;
  transition: all 0.5s ease;
  margin-left: 52px;
}



.container .left {
  position: absolute;
  bottom: 0;
  left: 0;
  width: 100px;
  height: 100px;
  background-image: url("@/assets/images/22_open.72c00877.png");
  background-size: 100% 100%;
  background-repeat: no-repeat;
  transition: all 0.5s ease;
}

.container .right {
  position: absolute;
  bottom: 0;
  right: 0;
  width: 100px;
  height: 100px;
  background: url("./assets/images/33_open.43a09438.png");
  background-size: 100% 100%;
  background-repeat: no-repeat;
  transition: all 0.5s ease;
}

.time {
  position: absolute;
  bottom: 0;
  color: #666;
  transition: all 0.1s ease;
}
</style>
