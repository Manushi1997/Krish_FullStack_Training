public class Test {
//ES6 Syntax
for(let i = 0;i<5;i++)
    {
        console.log(i);
    }
console.log(i);//undefined

//ES6 Syntax
for(var i = 0;i<5;i++)
    {
        console.log(i);//0,1,2,3,4
    }
console.log(i);//5
}