import React from 'react'

export const Clock = () => {
  let n=0;
  const Plus=()=>{
    n=n+1;
    document.getElementById("count").textContent=n;

  }
  const Minus =()=>{
    n=n-1;
    document.getElementById("count").textContent=n;

  }
  return (
    <div style = {{textAlign:"center", marginTop:"50px"}}>
      <h1 style={{color:"red"}}>Counter using button</h1>
      <button style={{margin:"20px",padding:"10px",fontSize:"20px"}} onClick={Plus}>+</button>
      <button style={{margin:"20px",padding:"10px",fontSize:"20px"}} onClick={Minus}>-</button>
      <h1 id="count">{n}</h1>
      <hr></hr>

    </div>
  )
}
