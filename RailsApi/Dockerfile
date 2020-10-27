FROM ruby:2.5.8

RUN apt-get update -qq
RUN apt-get install -y nginx openssh-server git-core openssh-client curl
RUN apt-get install -y build-essential git tig vim tmux ssh
RUN apt-get install -y openssl curl zlib1g zlib1g-dev libssl-dev libyaml-dev libsqlite3-dev sqlite3 libxml2-dev libxslt-dev autoconf libc6-dev ncurses-dev automake libtool bison subversion pkg-config

# install RVM, Ruby, and Bundler
RUN gem install sqlite3 --no-ri --no-rdoc

RUN mkdir /inventory_manager
WORKDIR /inventory_manager
ADD Gemfile /inventory_manager/Gemfile
ADD Gemfile.lock /inventory_manager/Gemfile.lock
RUN bundle install
ADD . /inventory_manager
