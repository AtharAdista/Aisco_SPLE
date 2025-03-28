#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.maribersedekah --module-path aisco.product.maribersedekah -m aisco.product.maribersedekah &

wait