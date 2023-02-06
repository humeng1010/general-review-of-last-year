const date = new Date()
console.log(date)
console.log(date.getFullYear());
console.log(date.getMonth() + 1);//getMonth 是从0-11开始的
console.log(date.getDate());// 获取一个月的第几天
console.log(date.getDay());//星期几 注意从0-6 星期天是0
console.log(date.getHours());//获取小时
console.log(date.getMinutes());//获取分
console.log(date.getSeconds());//获取秒

var array = ['星期天', '星期一', '星期二', '星期三', '星期四', '星期五', '星期六']
console.log('今天是' + date.getFullYear() + '年' + (date.getMonth() + 1) + '月' + date.getDate() + '日' + array[date.getDay()]);
const getTime = () => {
    var date = new Date();
    var hours = date.getHours();
    var minutes = date.getMinutes();
    var seconds = date.getSeconds();
    return (hours < 10 ? '0' + hours : hours) + ':' + (minutes < 10 ? '0' + minutes : minutes) + ':' + (seconds < 10 ? '0' + seconds : seconds)

}
console.log(getTime())

console.log(Date.now())