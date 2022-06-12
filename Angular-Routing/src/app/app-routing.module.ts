import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { ErrorComponent } from './error/error.component';
import { HomeComponent } from './home/home.component';
import { MembersComponent } from './members/members.component';
import { SingleMemberComponent } from './single-member/single-member.component';

const routes: Routes = [
  {path:"", component: HomeComponent},
  {path:"about", component: AboutComponent},
  {path:"members", component: MembersComponent, children:[
    {path:":member", component:SingleMemberComponent}
  ]},
  {path:"contact", component: ContactComponent},
  {path:"error", component: ErrorComponent},
  {path:"**", redirectTo:"error", pathMatch:"full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
