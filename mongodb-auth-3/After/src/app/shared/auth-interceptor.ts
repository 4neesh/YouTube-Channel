import { HttpHandler, HttpInterceptor, HttpRequest } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { AuthService } from "./auth-service";

@Injectable()
export class AuthInterceptor implements HttpInterceptor{

    constructor(private authService: AuthService){}

    intercept(req: HttpRequest<any>, next: HttpHandler){
        
        const authToken = this.authService.getToken();
        if(!authToken){
            return next.handle(req);
        }
        const authReq = req.clone({
            headers: req.headers.set("Authorization", authToken)
        });
        return next.handle(authReq);
    }

}