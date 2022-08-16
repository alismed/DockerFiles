FROM ubuntu

## configure tzdata and timezone during build
## https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
ENV TZ=America/Sao_Paulo
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN apt-get update && apt-get install -y \
    wget \
    curl \
    vim \
    unzip \
    awscli 

RUN wget --quiet https://releases.hashicorp.com/terraform/1.2.7/terraform_1.2.7_linux_amd64.zip \
  && unzip terraform_1.2.7_linux_amd64.zip \
  && mv terraform /usr/bin \
  && rm terraform_1.2.7_linux_amd64.zip
