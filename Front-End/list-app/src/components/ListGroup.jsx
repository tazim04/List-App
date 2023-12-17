import React, { useEffect, useState } from "react";
import './ListGroupStyle.css';

function ListGroup() {
  const [items, setItems] = useState([]); // hold items from db

  

  useEffect(() => {
    // api call to back-end
    fetch("http://localhost:8080/list/getAll")
      .then((result) => result.json())
      .then((item) => {
        setItems(item);
      });
  }, [items]); // put items as parameter to auto refresh after adding/deleting

  const deleteClick = (item) => {
    console.log("Deleting " + item.content + ", id=" + item.id);

    fetch("http://localhost:8080/list/delete", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ id: item.id, content: item.content }),
    }).then(() => {
      console.log("List item has been deleted");
    });
  };

  return (
    <>

      <h1
        className="text-center pt-5 pb-0 px-0"
        style={{ fontWeight: 400, fontSize: "xx-large" }}
      >
        List
      </h1>
      {items.length == 0 && (
        <p className="text-center">You have an emtpy list! Start by adding your first item.</p>
      )}
      <ul className="list-group pt-1 pb-0 px-0 col-5 mx-auto">
        {items.map((item) => (
          <li className="list-group-item" key={item.id}>
            {item.content}
            <button
              type="button"
              class="btn btn-danger btn-sm float-end"
              onClick={() => deleteClick(item)}
            >
              Delete
            </button>
          </li>
        ))}
      </ul>
    </>
  );
}

export default ListGroup;
