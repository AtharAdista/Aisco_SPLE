#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.variation2 --module-path aisco.product.variation2 -m aisco.product.variation2 &

wait