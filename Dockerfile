# Use an official Ubuntu runtime as a parent image
FROM ubuntu:latest

# Install Apache web server and PHP
RUN apt-get update && apt-get install -y apache2 php libapache2-mod-php

# Install MySQL and set root password
RUN apt-get update && \
    echo "mysql-server mysql-server/root_password password your_password" | debconf-set-selections && \
    echo "mysql-server mysql-server/root_password_again password your_password" | debconf-set-selections && \
    apt-get install -y mysql-server

# Configure Apache to use PHP
RUN a2enmod php7.4

# Copy Apache configuration file
COPY apache.conf /etc/apache2/sites-available/000-default.conf

# Expose ports
EXPOSE 80
EXPOSE 3306

# Start services
CMD service apache2 start && service mysql start && tail -f /var/log/apache2/error.log
