// function factors(n){

//     for(let i=1 ; i<=n ; i++){
//         if(n % i === 0){
//             console.log(i)
//         }
//     }
// }
// factors(6)

//-----

function factors(n){
    
    let count = 0;
    for(let i=1 ; i<=n ; i++){
        if(n % i === 0){
            count++;
        }
           console.log(i)
    }
}
factors(6)