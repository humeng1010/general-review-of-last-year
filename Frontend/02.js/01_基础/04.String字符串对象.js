var str = 'andy'
console.log(str.charAt(3));
// 遍历所有的字符
for (var i = 0; i < str.length; i++) {
    console.log(str.charAt(i));
    console.log(str[i]);
}

console.log(str[0]);//h5新增的获取0号位置的字符串

console.log('===========')
var str = 'abcdefgabdebba'
var obj = {}
for (var i = 0; i < str.length; i++) {
    if (obj[str.charAt(i)]) {
        obj[str[i]]++
    } else {
        obj[str[i]] = 1
    }
}
console.log(obj);
// 遍历对象
var ch = ''
var max = 0;
for (var k in obj) {
    if (obj[k] > max) {
        max = obj[k]
        ch = k
    }
}
console.log(max);
console.log('最多的字符是' + ch);
console.log('==============')
var str1 = 'andy'
console.log(str1.replace('a', 'b'));
var str2 = 'abababbb'
while (str2.includes('a')) {
    str2 = str2.replace('a', 'b')
}
console.log(str2);
// 分隔符
var str3 = 'a,b,c,d'
var arr = []
arr = str3.split(',')
console.log(arr);

// 大小写转换
var str4 = 'abc'
console.log(str4.toUpperCase());
var str5 = '  ABC   '
console.log(str5.toLowerCase());

// 去除首位空格
var str6 = ' ab c   '
console.log(str6.trim(str6));