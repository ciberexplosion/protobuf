# protobuf

_Instructions to run the server:_

1. ```sh
   $ go install google.golang.org/protobuf/cmd/protoc-gen-go@v1.26
   $ go install google.golang.org/grpc/cmd/protoc-gen-go-grpc@v1.1
   ```
2. Update path
   ```sh
   $ export PATH="$PATH:$(go env GOPATH)/bin"  
   ```
3. ```sh
   cd grpc-go/examples/helloworld
   ```
4. ```sh
   go run greeter_server/main.go
   ```   

_Instructions to run the Client:_

```sh
grpcScalaSample/run
   ```
