console.log(Math.PI)
console.log(Math.abs(-100))
console.log(Math.max(1, 2, 3))

const myMath = {
    max(...value) {
        let max = value[0]
        for (let i = 1; i < value.length; i++) {
            if (value[i] > max) max = value[i]
        }
        return max
    }
}

console.log(myMath.max(18, 3, 90, 0, 35))

console.log(Math.ceil(3.00008))

console.log(Math.floor(3.999999))

console.log(Math.random())