import React, { useState } from "react";

function ListForm() {
  const [content, setContent] = useState(""); // use state
  
  


  // handle onClick for add button
  const addClick = (e) => {
    e.preventDefault();

    // check if user is trying to enter emtpy list item
    const form = document.querySelector("form")
    if (!form.checkValidity()) {
      form.reportValidity(); // report empty input
      return;
    }

    document.getElementById("listInput").value = "";

    // api call to back-end
    fetch("http://localhost:8080/list/add", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ content: content }),
    }).then(() => {
      console.log("List item added: " + content);
      setContent("");
      document.getElementById("listInput").focus();
    });
  };

  return (
    <>
      <form>
        <div class="mb-3 mx-auto pt-100 pt-5 pb-0 px-0 w-50">
          <label for="listInput" className="form-label text-center" style={{fontWeight: 400, fontSize: "x-large"}}>
            New List item
          </label>
          <input
            type="text"
            className="form-control"
            id="listInput"
            placeholder="Start typing..."
            value={content}
            onChange={(e) => setContent(e.target.value)} // value saved to content
            required
            title="Can't insert an emtpy list item!"
          />
        </div>

        <div class="d-grid gap-2 col-2 mx-auto">
          <button
            class="btn btn-warning btn-sm"
            type="submit"
            onClick={addClick}
          >
            Add
          </button>
        </div>
      </form>
    </>
  );
}
export default ListForm;
