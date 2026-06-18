import React,{useState} from 'react';

export const UseState2 = () => {
    const [count,setCount] = useState(0);
  return (
    <div style={{textAlign:"center", marginTop:"50px"
    }}>
        <h1>Counter Clock</h1>
        <h2 color='red'>{count}</h2>
        <button onClick={()=>setCount(count+1)}>Increase</button>
        <button onClick={()=>setCount(count-1)}>Decrease</button>
        <button onClick={()=>setCount(0)}>Reset</button>

    </div>
  )
}
