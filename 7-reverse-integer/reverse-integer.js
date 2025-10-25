/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {var r=0,temp=0
    while(x!==0){var temp = x%10;
         x=parseInt(x/10);
        r=(r*10)+temp;
    } if(r < Math.pow(-2, 31)||r > Math.pow(2, 31)-1){return 0;
    }return r};