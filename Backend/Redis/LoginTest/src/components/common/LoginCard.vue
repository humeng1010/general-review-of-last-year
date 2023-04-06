<script setup lang="ts">
let time = new Date();

</script>

<template>
    <div class="container">
        <div class="register">

            <slot name="form"></slot>

            <slot name="footer"></slot>
            {{ time }}
        </div>
    </div>
</template>

<style scoped lang="less"></style>