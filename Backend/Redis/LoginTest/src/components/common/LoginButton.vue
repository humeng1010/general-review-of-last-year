<script setup lang="ts">
defineProps<{ title: String }>()
</script>

<template>
    <div class="submitBtn">
        <input class="btn" type="button" :value="title">
    </div>
</template>

<style scoped lang="less">
.btn {
    width: 150px;
    height: 50px;
    border-radius: 25px;
    border: none;
    background-color: rgba(0, 150, 0, 1);
    color: white;
    font-weight: bold;
    font-size: 16px;
    cursor: pointer;
    margin-top: 30px;
    transition: all 0.3s ease;

    &:hover {
        background-color: rgba(0, 150, 0, .8);
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
    }
}
</style>