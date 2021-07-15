#!/bin/bash
declare -r FOLDER_NAME="thefolder"

if find $FOLDER_NAME
    then
    echo "Ok: $FOLDER_NAME ha sido encontrado"
else 
    echo "Error: El Folder no existe"