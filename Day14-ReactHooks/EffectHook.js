import React,{useState, useEffect} from 'react'

export const EffectHook = () => {
    const [message,setMessage] = useState("Loading....");
    useEffect(()=>{
        const timer = setTimeout(()=>{
            setMessage("Hellooo, this is EffectHook example!");  
        },4000); 
        return ()=>clearTimeout(timer);
    },[]);
  return (
    <div style = {{textAlign:"center", marginTop:"50px"}}>
        <h1 style={{color:"red"}}>Example for useEffect</h1>
        <h1>{message}</h1>
        <hr></hr>
    </div>
  )
}
