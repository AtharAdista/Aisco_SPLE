#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.mariberbagi --module-path aisco.product.mariberbagi -m aisco.product.mariberbagi &

wait