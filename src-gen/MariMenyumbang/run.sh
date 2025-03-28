#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.marimenyumbang --module-path aisco.product.marimenyumbang -m aisco.product.marimenyumbang &

wait