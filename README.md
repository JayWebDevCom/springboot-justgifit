## About
Start of Just-Gif-It for Pluralsight course Spring Boot: Efficient Development, Configuration, and Deployment

UI: AngularJS + WebPack + ES6 (ES2015)
Backend: Spring Boot + JavaCV + Animated-Gif-Lib

## License
Version 2.0 of the Apache License

### healthcheck
- file storage dir writability
```bash
$ http -a user:pass :8080/health
```

### dockerize
- build a docker image named ijustgifit
```bash
$ docker build -t ijustgifit .
```

- run the app in a docker container named cjustgifit
```bash
$ docker run -it --rm -p 8080:8080 --name cjustgifit ijustgifit
```