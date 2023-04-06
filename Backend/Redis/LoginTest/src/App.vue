<script setup lang="ts">
import LoginButton from './components/common/LoginButton.vue';
import LoginCard from './components/common/LoginCard.vue'

import { ref } from 'vue'
import { login as loginUser, sendMessage as sendMessage2User } from '@/api/index'
const account = ref<String>()
const password = ref<String>()

const disable = ref(false)
const sendMessage = async () => {
  const res = await sendMessage2User(JSON.stringify({ account: account.value }))
  alert(res.isSuccess ? res.data : res.message)

}

const login = async () => {
  const user = {
    account: account.value,
    password: password.value
  }

  try {
    const res = await loginUser(JSON.stringify(user))
    alert(res.isSuccess ? res.data : res.message)
  } catch (error) {
    alert("服务端错误")
  }
}

const tow = ref("/src/assets/images/22_open.72c00877.png")
const three = ref("/src/assets/images/33_open.43a09438.png")

const changeImg = (methods: string) => {
  if (methods === "open") {
    tow.value = "/src/assets/images/22_open.72c00877.png"
    three.value = "/src/assets/images/33_open.43a09438.png"
  } else if (methods === "close") {
    tow.value = "/src/assets/images/22_close.0efad8c4.png"
    three.value = "/src/assets/images/33_close.eea03c39.png"
  }
}

</script>

<template>
  <LoginCard>
    <template #form>
      <div class="usernameDiv">
        <label for="username" class="title2">手机号:</label>
        <input v-model="account" type="text" name="account" class="inp" autocomplete="off" placeholder="请输入手机号">
      </div>

      <LoginButton :disable="disable" @click="sendMessage" :title="'发送短信'"></LoginButton>

      <div class="phoneDiv">
        <label for="phone" class="title2">验证码:</label>

        <input v-model="password" @focus="changeImg('close')" @blur="changeImg('open')" type="text" name="password"
          class="inp" id="phone" autocomplete="off" placeholder="请输入验证码">
      </div>

      <LoginButton @click="login" :title="'登陆'"></LoginButton>
    </template>
    <template #footer>
      <div class="left" id="left" :style="'background-image: url(' + tow + ');'">
      </div>
      <div class="right" id="right" :style="'background-image: url(' + three + ');'">
      </div>
    </template>

  </LoginCard>
</template>

<style lang="less">
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

input:focus {
  outline: none;
}

.container .register {
  padding: 40px;
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

.container .left {
  position: absolute;
  bottom: 0;
  left: 0;
  width: 100px;
  height: 100px;
  // background-image: url("@/assets/images/22_open.72c00877.png");
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
  // background: url("./assets/images/33_open.43a09438.png");
  background-size: 100% 100%;
  background-repeat: no-repeat;
  transition: all 0.5s ease;
}
</style>
