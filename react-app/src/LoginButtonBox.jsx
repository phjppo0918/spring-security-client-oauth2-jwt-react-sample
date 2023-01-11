import axios from "axios";
import { useEffect, useState } from "react";

axios.defaults.baseURL = "http://localhost:8080";
const LoginButtonBox = () => {
  useEffect(() => {
    axios({
      url: "/api/hello",
      method: "get",
    }).then((response) => {
      //console.log(response);
    });
  }, []);

  const postHello = () => {
    axios
      .post(
        "/api/hello",
        {},
        {
          headers: {
            "Access-Control-Allow-Origin": "*",
          },
        }
      )
      .then((r) => console.log(r.request.response.url));
  };

  const getHelloRed = () => {
    axios
      .get(
        "/api/hello/red",
        {},
        {
          headers: {
            "Access-Control-Allow-Origin": "*",
          },
        }
      )
      .then((r) => console.log(r.request.response.url));
  };

  return (
    <div>
      <button type="button" onClick={postHello}>
        안녕
      </button>
      <a href="http://localhost:8080/api/hello/red">hello redirect </a>
      <button type="button" onClick={getHelloRed}>
        안녕 red
      </button>
    </div>
  );
};

export default LoginButtonBox;
