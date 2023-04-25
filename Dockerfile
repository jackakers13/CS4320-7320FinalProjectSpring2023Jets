# Use an official Ubuntu runtime as a parent image
FROM ubuntu:jammy

# Install Dependencies
RUN apt update
# RUN apt install -y apache2
RUN apt install -y openjdk-17-jdk
RUN apt install -y mysql-server

# Set MySQL root password
RUN echo "mysql-server mysql-server/root_password password Password1!" | debconf-set-selections && \
    echo "mysql-server mysql-server/root_password_again password Password1!" | debconf-set-selections

# Copy Apache configuration file
# COPY apache.conf /etc/apache2/sites-available/000-default.conf

# Set bash as the container's shell
SHELL ["/bin/bash", "-c"]

# Copy all project files into image (this is lazy and can be minimized later)
ADD . /root/

# Build the backend
RUN cd /root/backend && \
    ./gradlew build

# Expose ports
EXPOSE 80
EXPOSE 3306

# Start services
# CMD service apache2 start \
# && service mysql start \
# && tail -f /var/log/apache2/error.log

# CMD service mysql start && \
#     mysql -e "create database users" && \
#     mysql -u root -e "SET PASSWORD FOR root@'localhost' = PASSWORD('admin');" && \
#     cd /root/internal_scripts && \
#     ./start-backend.sh && \
#     cd .. && \
#     bash
# mysql -e "GRANT ALL PRIVILEGES ON *.* TO 'root'@'localhost' IDENTIFIED BY 'Password1!' WITH GRANT OPTION" && \

CMD bash
