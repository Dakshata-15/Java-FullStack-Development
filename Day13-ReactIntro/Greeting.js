import React from 'react'

export const Greeting = (props) => {
  return (
    <div>
        <h1>Hello, {props.name}!</h1>
        <p>You are {props.age} years old.</p>
    </div>
  );
};

export const Greet = ()=>{
    return (
        <div>
            <Greeting name = "Dakshata" age={20}/>
            <Greeting name  = "Govi" age={30}/>
        </div>
    )
}
