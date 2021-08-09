#!/bin/bash
##############functions ##################
if [ "$1" = "start" ]; then
 echo " service Starting"
 docker-compose -f ./localDevDockerSetup.yml up -d
 
 elif [ "$1" = "stop" ]; then
 echo "service stopped"
 docker-compose -f ./localDevDockerSetup.yml stop
 
 elif [ "$1" = "remove" ]; then
 echo "serviced are stopped and removed"
 docker-compose -f ./localDevDockerSetup.yml down -v
else
    echo "valid args -> {  start,stop,remove}"
    exit
fi