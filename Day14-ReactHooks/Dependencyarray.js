import React, {useState, useEffect} from 'react'

export const Dependencyarray = () => {
    const[count, setCount] = useState(0);
    useEffect(()=>{
        console.log("Count changed to:", count);
        alert("Count is now"+count);
    },[count]);
  return (
    <div style={{textAlign:"center",marginTop:"50px"}}>
        <h1>Count:{count}</h1>
        <button onClick={()=>setCount(count+1)}>Increase</button>
        <hr></hr>
    </div>
  );
}
