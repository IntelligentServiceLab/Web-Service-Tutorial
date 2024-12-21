document.getElementById('calculator-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const num1 = document.getElementById('num1').value;
    const num2 = document.getElementById('num2').value;
    const operation = document.getElementById('operation').value;

    fetch(`http://localhost:8080/${operation}?a=${num1}&b=${num2}`)
        .then(response => response.json())
        .then(data => {
            if (data.code === 200) {
                document.getElementById('result').innerText = `Result: ${data.data}`;
            } else {
                document.getElementById('result').innerText = `Error: ${data.msg}`;
            }
        })
        .catch(error => {
            console.error('Fetch error:', error);
            document.getElementById('result').innerText = `Error: ${error.message}`;
        });
});