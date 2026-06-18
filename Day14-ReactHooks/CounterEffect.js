import React, { useState, useEffect } from "react";

function CounterEffect() {
  const [count, setCount] = useState(0);

  useEffect(() => {
    const timer = setInterval(() => {
      setCount((prevCount) => prevCount + 1);
    }, 5000);

    return () => clearInterval(timer);
  }, []);

  return (
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h1 style={{color:"red"}}>Automated Counter using useEffect</h1>
      <h2>Count: {count}</h2>
      <hr></hr>
    </div>
  );
}

export default CounterEffect;