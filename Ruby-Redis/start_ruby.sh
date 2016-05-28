#!/bin/bash
docker run -it -p 3000:3000 --link redis_server:redis -v $(pwd)/projects:/projects centos/rails

