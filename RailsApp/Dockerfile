FROM ruby:2.5.8

# aplication name
ENV APP_NAME "change-the-app-name"

# install softwares
RUN apt-get update -qq
RUN apt-get install -y nginx openssh-server git-core openssh-client curl
RUN apt-get install -y build-essential git tig vim tmux ssh
RUN apt-get install -y openssl curl zlib1g zlib1g-dev libssl-dev libyaml-dev libsqlite3-dev sqlite3 libxml2-dev libxslt-dev autoconf libc6-dev ncurses-dev automake libtool bison subversion pkg-config
RUN curl -sL https://deb.nodesource.com/setup_14.x | bash -
RUN apt-get install -y nodejs
RUN curl -sS https://dl.yarnpkg.com/debian/pubkey.gpg | apt-key add -
RUN echo "deb https://dl.yarnpkg.com/debian/ stable main" | tee /etc/apt/sources.list.d/yarn.list
RUN apt update && apt install yarn

# setup application
RUN mkdir /$APP_NAME
WORKDIR /$APP_NAME/$app_name
ADD Gemfile /$APP_NAME/Gemfile
ADD Gemfile.lock /$APP_NAME/Gemfile.lock
RUN bundle install
ADD . /$APP_NAME

