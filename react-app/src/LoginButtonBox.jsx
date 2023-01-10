import axios from "axios";
import { useEffect, useState } from "react";

const LoginButtonBox = () => {
  const [text, setText] = useState("");

  useEffect(() => {
    axios({
      url: "/api/hello",
      method: "get",
    }).then((response) => {
      setText(response.data);
    });
  }, []);

  return (
    <>
    <div>"hello connection test"</div>
    <div>{text}</div>

    </>
  );
};

export default LoginButtonBox;