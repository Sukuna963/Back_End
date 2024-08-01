#!/bin/sh

echo "Create Hero Table"

awslocal dynamodb create-table \
    --table-name db_hero \
    --attribute-definitions \
        AttributeName=id,AttributeType=S \
    --key-schema \
        AttributeName=id,KeyType=HASH \
    --provisioned-throughput \
        ReadCapacityUnits=5,WriteCapacityUnits=5