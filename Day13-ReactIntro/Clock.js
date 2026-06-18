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
    <div>
      <button onClick={Plus}>+</button>
      <button onClick={Minus}>-</button>
      <h1 id="count">{n}</h1>

    </div>
  )
}




