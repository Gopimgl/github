function g(n){
    let p=false;
    if(n<=1){
        return "not prime";
    }
    else if(n===2){
        return "prime";
    }
    else{
       for(let i=2;i<Math.sqrt(n);i++){
        if(n/i==0){
            p=true;
        }
        else{
            p=false;
        }
       }
       
    }
    if(p){
        console.log("it is not  prime");
    }
    else{
        console.log("it is prime");
    }

};
g(17);