import React from 'react'

export const Compute = () => {
    const n=300
    
    const handleClick=()=>{
        const msg = document.getElementById("result");
        msg.textContent="Good cat";
        msg.style.color="red";
    }
    const changepic=()=>{
        const msg = document.getElementById("messi");
        msg.src = "https://thfvnext.bing.com/th/id/OIP.wbKnTTT6D2F74HKYBFDPgAHaE7?w=208&h=139&c=7&r=0&o=7&cb=thfvnextfalcon2&dpr=1.3&pid=1.7&rm=3" ;
    }
    
  return (
    <div>
    <h1>EVENT HANDLING:{n}</h1>
    <h1 id="result" onClick={handleClick}>Good dog.......</h1>
    <img src="https://thfvnext.bing.com/th/id/OIP.f7_t4U-9xmXkOKY8fpblNwHaGS?o=7&cb=thfvnextfalcon2rm=3&rs=1&pid=ImgDetMain&o=7&rm=3"  id="messi" width="500" onClick={changepic}></img>
    <br />
    <h1 id="res"></h1>
    
    </div>
    );
}
