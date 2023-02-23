FROM ruby:3.1.0

# Set the working directory
WORKDIR /app

# Install dependencies
RUN apt-get update && \
    apt-get install -y \
    build-essential \
    nodejs \
    postgresql-client && \
    rm -rf /var/lib/apt/lists/*

# Install gems
COPY Gemfile Gemfile.lock ./
RUN gem install bundler && \
    bundle install --jobs 4

# Copy the application code
COPY . .

# Expose ports
EXPOSE 3000

# Set the entrypoint command
CMD ["rails", "server", "-b", "0.0.0.0"]
