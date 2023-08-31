# Ktor-Api
A simple backend provider built using Kotlin ktor.

Ktor API is a backend service that provides random Alf images for the Alf App.

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/nisaefendioglu/ktor-api.git
   ```

2. Open the project in your preferred IDE.

3. Run the Ktor server locally:

   ```bash
   ./gradlew :run
   ```

4. The server will start at `http://localhost:8100`.

## Endpoints

### `GET /random-alf`

Returns a JSON response containing a random Alf image URL.

Example response:

```json
{
  "url": "http://localhost:8100/randomalf"
}
```

![image](https://github.com/nisaefendioglu/ktor-api/assets/48391281/954275b8-8e7b-401e-8a7e-050cbbe870cf)


## Dependencies

- Ktor framework for building asynchronous servers.
- Gson for JSON serialization/deserialization.
- Coroutine for managing asynchronous operations.

## Configuration

To configure the server port, update the `application.conf` file:

```conf
ktor {
    deployment {
        port = 8100 // Change to your preferred port
    }
}
```

## Contributing

Contributions are welcome! If you find an issue or want to enhance the API, feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
