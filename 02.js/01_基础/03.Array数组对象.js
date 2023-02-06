var arr = [1, 2, 3]
// 数组尾部添加 改变原数组 返回值是数组大小
arr.push(4, 'black');
console.log(arr);
// 删除末尾元素
arr.pop();
arr.pop();
console.log(arr);
// 在数组开头添加元素
arr.unshift(0);
console.log(arr);
// 在数组前面删除数组
arr.shift()
console.log(arr);

var arr = ['start', 2, 3, 'end']
arr.reverse()
console.log(arr);

var arr1 = [1, 2, 5, 3, 7, 8, 4, 6, 11, 12]
// arr1.sort() //1, 11, 12, 2, 3, 4, 5, 6, 7, 8 我们发现结果不是我们想要的
//升序 原理就是里面是一个比较函数 类似于java的排序中的比较器 这种写法是箭头函数 Lambda表达式
arr1.sort((a, b) => a - b);
console.log(arr1);
//降序
arr1.push(33)
arr1.sort((a, b) => b - a);
console.log(arr1);


var arr = [1, 2, 3, 4, 5]
const result = arr.reduce((preValue, currentValue) => {
    return preValue + currentValue
}, 0)
console.log(result)

const result2 = arr.filter((item) => {
    return item % 2 === 0
})
console.log(result2)

const result3 = arr.find((item) => {
    return item === 2
})
console.log(result3)

const result4 = arr.map((item) => {
    return `<li>${item}</li>`
})
console.log(result4)